#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'4\npush 1 push 2 pop size' $'2\n1\n'
run_case $'3\npeek push 5 peek' $'empty\n5\n'
run_case $'2\npush 7 pop' $'7\n'
run_case $'1\nsize' $'0\n'
run_case $'3\npush 1 push 2 size' $'2\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
