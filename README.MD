# cmd

The cmd directory contains the translation of the getopt GNU library

```plaintext
cmd/
├── doc/        # documentation for the API
├── client/     # client code example
└── parser/     # source code for cmd parser API
```

To generate docs run the following command from the root folder

javadoc -d cmd/docs cmd/parser/\*.java

# collation

Collation directory contains static class of collation function from GNU C platform to
Java platform.

The directory structure of this directory is:

```plaintext
collation/
├── doc/        # document of Collation.java
├── client/     # client code for testing Collation.java
└── collation/  # source code for Collation.java
```

All the functions from GNU C library are:

-   `strcoll`: Performing string compare using collation sequence of current locale.
-   `wcscoll`: Performing wide character string compare using collation sequence of
    current locale.
-   `strxfrm`: Transform multibyte string called _from_ using current locale and save up
    to _size_ bytes to another multibyte string called _to_. This function will return the
    length of the entire transformed string.
-   `wcsxfrm`: Perform very similar to strxfrm, but operate on wide character.

All functions translated to Java platform:

-   `strcoll`:

# fractions
