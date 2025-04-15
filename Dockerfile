FROM hashicorp/consul:latest
CMD ["agent", "-dev", "-client=0.0.0.0"]