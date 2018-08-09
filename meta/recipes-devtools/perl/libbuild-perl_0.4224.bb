SUMMARY = "Module::Build - Build and install Perl modules"
DESCRIPTION = "\"Module::Build\" is a system for building, testing, and \
installing Perl modules. It is meant to be an alternative to \
\"ExtUtils::MakeMaker\". Developers may alter the behavior of the module through \
subclassing in a much more straightforward way than with MakeMaker. It also does \
not require a make on your system - most of the Module::Build code is pure-perl \
and written in a very cross-platform way."

SECTION = "libs"

HOMEPAGE = "https://metacpan.org/pod/Module::Build"

LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;beginline=120;endline=129;md5=6fbc94ee22809425f25eb625197b9fbf"

SRCNAME = "Module-Build"
SRC_URI = "${CPAN_MIRROR}/authors/id/L/LE/LEONT/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "b74c2f6e84b60aad3a3defd30b6f0f4d"
SRC_URI[sha256sum] = "a6ca15d78244a7b50fdbf27f85c85f4035aa799ce7dd018a0d98b358ef7bc782"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit cpan

RDEPENDS_${PN} = " \
    perl-module-cwd \
    perl-module-extutils-cbuilder \
    perl-module-extutils-makemaker \
    perl-module-file-basename \
    perl-module-file-spec \
"

BBCLASSEXTEND = "native"
