FROM python:3.7-alpine

WORKDIR /app

COPY requirements.txt .

RUN pip install -r requirements.txt

# for performance wise.
COPY . .

EXPOSE 5002

CMD ["python", "precip_server.py"]