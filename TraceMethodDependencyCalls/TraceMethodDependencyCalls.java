package aspects;

import java.util.logging.*;
import java.util.Stack.*;

import org.aspectj.lang.Signature;

aspect Trace{

        private static Logger logger = Logger.getLogger("tmdcTrace1");
		private Stack globalMethods;
		
        public Trace(){
		
        try{
				globalMethods = new Stack();
                FileHandler handler=new FileHandler("tmdcTrace1.log",false);

                logger.addHandler(handler);

                handler.setFormatter(new Formatter(){

                        public String format(LogRecord record){
                                return record.getMessage()+"\n";
                                }
                                });
                        }

        catch(Exception e){}
			System.out.println("Quickly call Trump to build a wall around this error");
        }

        pointcut traceMethods() : (call(* *(..))&& !cflow(within(Trace)));

        before(): traceMethods(){
			
			if(!globalMethods.empty()){
				//(a) log the method call if the current stack is not empty
			}
                Signature sig = thisJoinPointStaticPart.getSignature();
                String line =""+ thisJoinPointStaticPart.getSourceLocation().getLine();
                String sourceName = thisJoinPointStaticPart.getSourceLocation().getWithinType().getCanonicalName();
                Logger.getLogger("tmdcTrace1").log(
                        Level.INFO,
                        "Call -> "
                        +  sourceName
                        +" line " +
                        line
                        +" to " +sig.getDeclaringTypeName() + "." + sig.getName()
                );
        }
		
		after(): traceMethods(){
				endTime = System.nanoTime();
                Signature sig = thisJoinPointStaticPart.getSignature();
                String line =""+ thisJoinPointStaticPart.getSourceLocation().getLine();
                String sourceName = thisJoinPointStaticPart.getSourceLocation().getWithinType().getCanonicalName();
                Logger.getLogger("tmteTrace1").log(
                        Level.INFO,
                        //"Time -> " + (endTime - startTime) + " Nano Seconds -> Call from "
						"Execution -> "
                        +  sourceName
                        +" line " +
                        line
                        +" to " +sig.getDeclaringTypeName() + "." + sig.getName() 
                );
				
        }
}