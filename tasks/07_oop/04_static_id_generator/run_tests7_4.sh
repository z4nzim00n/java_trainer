#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'2\nAlice Bob' $'1 Alice\n2 Bob\n'
run_case $'1\nSolo' $'1 Solo\n'
run_case $'3\nA B C' $'1 A\n2 B\n3 C\n'
run_case $'4\nw x y z' $'1 w\n2 x\n3 y\n4 z\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
