package aspects;

import java.util.logging.*;
import java.util.Timer;
import org.aspectj.lang.Signature;

aspect Trace{

        private static Logger logger = Logger.getLogger("Tracing1");
		long startTime = 0L;
		long endTime = 0L;
		
		Timer timerAfer;
        public Trace(){

        try{
                FileHandler handler=new FileHandler("trace.log",false);

                logger.addHandler(handler);

                handler.setFormatter(new Formatter(){

                        public String format(LogRecord record){
                                return record.getMessage()+"\n";
                                }
                                });
                        }

        catch(Exception e){}

        }

        pointcut traceMethods() : (execution(* *(..))&& !cflow(within(Trace)));

        before(): traceMethods(){
				startTime = System.currentTimeMillis();
                
        }
		
		after(): traceMethods(){
				endTime = System.currentTimeMillis();
                Signature sig = thisJoinPointStaticPart.getSignature();
                String line =""+ thisJoinPointStaticPart.getSourceLocation().getLine();
                String sourceName = thisJoinPointStaticPart.getSourceLocation().getWithinType().getCanonicalName();
                Logger.getLogger("Tracing1").log(
                        Level.INFO,
                        "Time -> " + (endTime - startTime) + " MilliS -> Call from "
                        +  sourceName
                        +" line " +
                        line
                        +" to " +sig.getDeclaringTypeName() + "." + sig.getName() 
                );
				
        }
}