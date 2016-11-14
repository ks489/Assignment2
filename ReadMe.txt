Install AspectJ and set up environmental variables.
git clone https://github.com/apache/commons-math.git
mvn package -Dmaven.skip.test=true
Type the following -> ajc -cp C:\aspectj1.8\lib\aspectjrt.jar -outxml -outjar aspects.jar Trace.java

//all these are wrong
java -javaagent:C:\aspectj1.8\lib\aspectjweaver -cp F:\Projects\University\uol-inf co7506\Git\Assignment2\Tracer\aspects.jar:target/classes/:target/test-classes/:../junit-4.12.jar:../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.math4.util.BigRealTest
java -javaagent:C:\aspectj1.8\lib\aspectjweaver.jar -cp F:\Projects\University\uol-inf co7506\Git\Assignment2\Tracer\aspects.jar:target/classes/:target/test-classes/:../junit-4.12.jar:../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.math4.util.BigRealTest
java -javaagent:../aspectjweaver.jar -cp ../aspects.jar:target/classes/:target/test-classes/:../junit-4.12.jar:../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.math4.util.BigRealTest

//This one is correct
//Not to self on windows you need ; instead of : to separate 
java -javaagent:../aspectjweaver.jar -cp ../aspects.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.math4.util.BigRealTest