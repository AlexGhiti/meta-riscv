require recipes-kernel/linux/linux-riscv-common.inc

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

LINUX_VERSION ?= "4.19"

KERNEL_VERSION_SANITY_SKIP="1"

#BRANCH = "int/alex/riscv_hugetlbfs_v2"
#SRCREV = "96ff5b4a1053696c8aa49e81e3afa56a23c0110c"
#BRANCH = "int/alex/mmap_top_down_v4"
#BRANCH = "dev/alex/test"
BRANCH = "int/alex/riscv_hugetlbfs_v2_rebase_v5.2rc1"
SRCREV = "506f47157556e993071f6764abde84b6211de3a3"
