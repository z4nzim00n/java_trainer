#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

printf 'line1\nline2\n' > /tmp/jt_file1.txt
run_case_args "/tmp/jt_file1.txt" "" $'line1\nline2\n'

printf 'hello' > /tmp/jt_file2.txt
run_case_args "/tmp/jt_file2.txt" "" 'hello'

printf '' > /tmp/jt_file3.txt
run_case_args "/tmp/jt_file3.txt" "" ''

run_case_args "/tmp/jt_missing_file.txt" "" $'Error: file not found\n'

rm -f /tmp/jt_file1.txt /tmp/jt_file2.txt /tmp/jt_file3.txt

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
