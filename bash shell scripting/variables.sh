#!/bin/sh

# vriable_name=variable_value

NAME="PSL employee"  # scaler variable
echo $NAME

# readonly NAME
echo $NAME
NAME="Saswata"
echo $NAME
# try with 'unset' command too

#Special variables
echo $0
echo $1

# $0
# $1...9
# $#
# $* -> all the arguments that are double quoted
# $@ -> 
# $? -> exit status of the last command executed
# $$ -> process snumber (PID) of the current shell for the shell script

