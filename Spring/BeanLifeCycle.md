
## Bean LifeCycle
https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring/

## Difference between close() and registerShutdownHook()
Basically, AbstractApplicationContext#close() will close, or shutdown, the ApplicationContext at the time it is 
invoked, while AbstractApplicationContext#registerShutdownHook() will close, or shutdown, the ApplicationContext 
at a later time when the JVM is shutting down for whatever reason. This will be achieved by utilizing the JVM 
shutdown hook functionality.

## void close() -> Close this application context, releasing all resources and locks that the implementation might hold.
## void registerShutdownHook() ->Register a shutdown hook with the JVM runtime, closing this context on JVM shutdown 
unless it has already been closed at that time.

In either case, the actual closing is done by the doClose() method.

If you are curious about why your outputs look so similar, it is because they are effectively doing the same thing,
whether you call #close() or #registerShutdownHook(),  #close will be shutDown right away, 
and #registerShutdownHook will be shutdown just before the JVM will exit, which is pretty much as soon as the method 
is done being invoked, because it is the last line of code!



