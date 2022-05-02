# TODO: Upgrade to Python3, but I am a bit lazy, whats the worst that could happen
FROM python:2

RUN apt update && apt full-upgrade -y && apt install xinetd -y
COPY ./ctf.xinetd /etc/xinetd.d/ctf
COPY ./entrypoint.sh /entrypoint.sh
RUN echo "Blocked by ctf_xinetd" > /etc/banner_fail

RUN chmod +x /entrypoint.sh

COPY ./challenge.py /challenge.py

CMD ["/entrypoint.sh"]
