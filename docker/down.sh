#!/bin/bash
echo "shutting down docker instance..."
docker stop systech_collector_postgres
docker stop systech_collector_rabbit
