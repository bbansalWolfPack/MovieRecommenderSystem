# Bean Scope
The term bean scope refers to the lifecycle and the visibility of beans.
There are six types of scopes: singleton, prototype, request, session, application, and websocket.

# Singleton Scope
The default scope of a bean is singleton, in which only one instance of the bean is created and cached in memory.

# Prototype Scope
Prototype scope results in the creation of new beans whenever a request for the bean is made to the application context.