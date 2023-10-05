#!/bin/bash

# Get the directory of the currently focused Java file
dir="$(dirname "$1")"

# Compile the Java file with output directory set to 'out'
if javac -d "./.out" "$1"; then
    # Compilation was successful, proceed to run the program

    # Get the base filename without the .java extension
    filename="$(basename "$1" .java)"

    # Run the Java program with the classpath set to 'out'
    java -cp "./.out" "$1" "$filename" < ./.vscode/input.txt > ./.vscode/output.txt

    # Check if the Java program ran successfully
    if [ $? -eq 0 ]; then
        # Program executed without errors
        exit 0
    else
        # Program encountered an error during execution
        exit 1
    fi
else
    # Compilation failed
    exit 2
fi
