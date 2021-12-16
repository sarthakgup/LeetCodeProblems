# Read from the file file.txt and output the tenth line to stdout.

#My Sol:
cat file.txt | sed -n "10p"

#LC Sol:
# head -n 10 file.txt | tail -n + 10
