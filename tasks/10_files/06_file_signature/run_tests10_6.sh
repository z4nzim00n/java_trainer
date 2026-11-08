#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

printf '\x89PNG\r\n\x1a\n' > /tmp/jt_png.bin
run_case_args "/tmp/jt_png.bin" "" $'PNG\n'

printf '%%PDF-1.4\n' > /tmp/jt_pdf.bin
run_case_args "/tmp/jt_pdf.bin" "" $'PDF\n'

printf 'PK\x03\x04rest' > /tmp/jt_zip.bin
run_case_args "/tmp/jt_zip.bin" "" $'ZIP\n'

printf 'hello' > /tmp/jt_text.bin
run_case_args "/tmp/jt_text.bin" "" $'UNKNOWN\n'

printf '' > /tmp/jt_empty.bin
run_case_args "/tmp/jt_empty.bin" "" $'UNKNOWN\n'

printf 'PN' > /tmp/jt_short.bin
run_case_args "/tmp/jt_short.bin" "" $'UNKNOWN\n'

rm -f /tmp/jt_png.bin /tmp/jt_pdf.bin /tmp/jt_zip.bin /tmp/jt_text.bin /tmp/jt_empty.bin /tmp/jt_short.bin

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
