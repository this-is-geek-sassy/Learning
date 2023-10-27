#!/bin/sh

# function name() {
	# list of commands
# }

#Define function
Hello(){
	echo "Hello $1 $2"
	return 10
}

#Invoke functio
Hello Priyanka Chopra

#capture value
ret=$?
echo "return value is $ret"

