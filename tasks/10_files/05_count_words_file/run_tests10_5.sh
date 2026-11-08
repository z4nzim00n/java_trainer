#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

printf 'hello world\n' > /tmp/jt_text1.txt
run_case_args "/tmp/jt_text1.txt" "" $'2\n'

printf 'one two three\n' > /tmp/jt_text2.txt
run_case_args "/tmp/jt_text2.txt" "" $'3\n'

printf 'one\ntwo three\n\nfour\n' > /tmp/jt_text3.txt
run_case_args "/tmp/jt_text3.txt" "" $'4\n'

printf '' > /tmp/jt_text4.txt
run_case_args "/tmp/jt_text4.txt" "" $'0\n'

printf '   \n' > /tmp/jt_text5.txt
run_case_args "/tmp/jt_text5.txt" "" $'0\n'

rm -f /tmp/jt_text1.txt /tmp/jt_text2.txt /tmp/jt_text3.txt /tmp/jt_text4.txt /tmp/jt_text5.txt

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
