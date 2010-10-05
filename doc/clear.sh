#!/usr/bin/sh
rm -v *.aux *.dvi *.nav *.snm *.toc *.vrb *.backup *.log *.out
mv -v *.ps *.tex~ /tmp/
chmod -x *.tex
chmod +x *.pdf
