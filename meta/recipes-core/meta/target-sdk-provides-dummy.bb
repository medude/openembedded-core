DUMMYARCH = "sdk-provides-dummy-target"

DUMMYPROVIDES = "\
    busybox \
    coreutils \
    bash \
    perl \
    perl-module-re \
    perl-module-strict \
    perl-module-vars \
    perl-module-text-wrap \
    libxml-parser-perl \
    perl-module-bytes \
    perl-module-carp \
    perl-module-constant \
    perl-module-data-dumper \
    perl-module-errno \
    perl-module-exporter \
    perl-module-file-basename \
    perl-module-file-compare \
    perl-module-file-copy \
    perl-module-file-find \
    perl-module-file-glob \
    perl-module-file-path \
    perl-module-file-stat \
    perl-module-file-temp \
    perl-module-getopt-long \
    perl-module-io-file \
    perl-module-overload \
    perl-module-posix \
    perl-module-thread-queue \
    perl-module-threads \
    perl-module-warnings \
    /bin/sh \
    /bin/bash \
    /usr/bin/env \
    /usr/bin/perl \
    pkgconfig \
"

require dummy-sdk-package.inc
