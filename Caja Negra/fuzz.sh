#!/bin/bash
# Build and run the instrumented executable

# AFL installation path, modify as required
AFL=/home/sky/AFL

# Use AFL as a compile front-end
export CC=$AFL/afl-clang
export CXX=$AFL/afl-clang++

# Build the instrumented executable and run it under AFL
mkdir -p aflbuild \
&& cd aflbuild \
&& cmake .. \
&& make \
&& $AFL/afl-fuzz -i ../testcases -o ../findings ./../a.out
