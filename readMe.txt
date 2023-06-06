How to install and use:
Using command line type "java -jar Sort.jar -t<h|a|v> -s<b|s|i|m|q|z> -f<some file location>" with everything between <> being placeholders. 
please do not include <> in arguments.
use command line arguments or config varaibles in your ide to feed input for -t, -f and -s. 
with -s being for sort type, -t being measurement to be sorted and -f being the file location.

Completeness: 100%

Deficiencies or missing functionality:
Some sort methods are far too slow to sort files that are too large. This can cause significant slow down if attempted. 
The longest time recorded by the authors was 5 hours with no output. 
Some sort methods, like heap sort, are unstable and could produce varying results.
The output for extremely large files can be difficult to parse as the user. Visual display may alleviate this but is beyond the scope of the assignment.