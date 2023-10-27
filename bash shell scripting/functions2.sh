#!/bin/sh

#define function

number_one () {
	echo "alpha online....over"
	number_two
}

number_two() {
	echo "beta online...over"
}

number_one

