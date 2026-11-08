#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\napple banana apple cherry banana' $'apple 2\nbanana 2\ncherry 1\n'
run_case $'1\nx' $'x 1\n'
run_case $'4\nb a b a' $'a 2\nb 2\n'
run_case $'3\nz z z' $'z 3\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
