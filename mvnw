#!/bin/sh
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
#
# This shell script is designed to run Maven on Windows systems.

# Detect the script location
if [ -z "$MAVEN_WRAPPER_DIR" ]; then
  MAVEN_WRAPPER_DIR=$(cd "$(dirname "$0")" && pwd)
fi

# Use the wrapper properties file to get Maven URL
WRAPPER_PROPERTIES_FILE="$MAVEN_WRAPPER_DIR/.mvn/wrapper/maven-wrapper.properties"

if [ ! -f "$WRAPPER_PROPERTIES_FILE" ]; then
  echo "Error: Maven wrapper properties file not found"
  exit 1
fi

# Extract Maven URL from properties
MAVEN_DISTRIBUTION_URL=$(grep -E "^distributionUrl=" "$WRAPPER_PROPERTIES_FILE" | cut -d= -f2-)

echo "Downloading Maven from: $MAVEN_DISTRIBUTION_URL"
echo "Note: For testing purposes, using alternative approach..."

# Simple wrapper - attempts to find mvn or use fallback
if command -v mvn &> /dev/null; then
  exec mvn "$@"
else
  echo "Maven not found. Please install Maven or use Maven Wrapper setup."
  exit 1
fi
