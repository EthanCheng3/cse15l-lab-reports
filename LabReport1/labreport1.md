![Image](cdNoArgs.png)
Example of the `cd` command in the lecture1 directory with no arguments

When cd is executed without arguments, the user is returned to the home directory.

This output is not an error.

![Image](cdPathDirectory.png)
Example of the `cd` command in the home directory with lecture1 as the argument

Changes the directory from the home directory to the lecture1 directory.

This output is not an error.


![Image](cdPathFile.png)
Example of the `cd` command in the messages directory with en-us.txt as the argument

Attempts to change directory to the file en-us.txt and throws an error due to it not being a directory.

This output is an error as there is no collection of files or directories inside a file.

![Image](lsNoArgs.png)
Example of the `ls` command in the home directory with no argument

Lists all the files and directories inside the current directory that the user is in.

This output is not an error.

![Image](lsPathDirectory.png)
Example of the `ls` command in the lecture1 directory with messages as the argument

Lists all the files and directories inside the argument.

This output is not an error.

![Image](lsPathFile.png)
Example of the `ls` command in the messages directory with en-us.txt as the argument

Returns the name of the file of the argument.

This output is not an error as it is not possible to see the subdirectories or files of a file.

![Image](catNoArgs.png)
Example of the `cat` command in the home directory with no argument

Echoes anything written inside the terminal

This output is not an error, when there is no argument, it concatenates any command input.

![Image](catPathDirectory.png)
Example of the `cat` command in the home directory with lecture1 as the argument

Returns the name and prints `This is a directory`.

This output is not an error.

![Image](catPathFile.png)
Example of the `cat` command in the messages directory with en-us.txt as the argument

Reads and returns the contents of the file on the terminal through standard output.

This output is not an error.
