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



======Reusable project commands=======
ajc -cp ..\Libraries\aspectjrt.jar -outxml -outjar tmteTracer.jar TraceMethodTimeExecution.java
//MATHS - LAB
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodTimeExecution/tmteTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.math4.util.BigRealTest
//FTP - ASSIGNMENT
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodTimeExecution/tmteTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPClientConfigFunctionalTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodTimeExecution/tmteTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPClientConfigTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodTimeExecution/tmteTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPClientTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodTimeExecution/tmteTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPCommandTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodTimeExecution/tmteTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.ListingFunctionalTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodTimeExecution/tmteTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.TestConnectTimeout

ajc -cp ..\Libraries\aspectjrt.jar -outxml -outjar tmdcTracer.jar TraceMethodDependencyCalls.java
//MATHS - LAB
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodDependencyCalls/tmdcTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.math4.util.BigRealTest
//FTP - ASSIGNMENT
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodDependencyCalls/tmdcTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPClientConfigFunctionalTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodDependencyCalls/tmdcTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPClientConfigTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodDependencyCalls/tmdcTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPClientTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodDependencyCalls/tmdcTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.FTPCommandTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodDependencyCalls/tmdcTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.ListingFunctionalTest
java -javaagent:../Assignment2/Tracer/Libraries/aspectjweaver.jar -cp ../Assignment2/Tracer/TraceMethodDependencyCalls/tmdcTracer.jar;target/classes/;target/test-classes/;../junit-4.12.jar;../hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.apache.commons.net.ftp.TestConnectTimeout


