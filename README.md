#Peer to Peer Messenger
Architecture
------------------------------------------------------------------------------------------
->Sand Messenger server keeps track of all the nodes in the sand network(custom network), so every one in that network can communicate with every other node in that network.
->Each node in the netwok acts both as a server and a client, traditional peer to peer architecture. The person who is initiating the communication act as a client and the other peer as server.
->When ever a new node enters the network, it informs its IP Address to the Sand Messenger server, which updates its own datastructure.
->The Sand Messenger keeps publising the datastructure to all the connected nodes, in which it stored the information of all the nodes .Thus allowing every node to communicate with every other node. This eliminates the situation, where every client message having to go through central server.

Files     
------------------------------------------------------------------------
Central package contains all the files related to the sand messenger.
Local Package contains all the files related to the local node.
Database package contains all the data models used in the application.
User Interface package contains all the UI modules used in the application.

How to Run
--------------------------------------------------------------------------
NetBeans IDE with java8(eclipse should work fine thought I didn't try it.)
Run Driver.java in sand/messenger/central package, which runs the sand messenger.
Run DriverLocal.java in sand/messenger/local package which runs the node.