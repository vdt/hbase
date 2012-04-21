/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.apache.hadoop.hbase.thrift;

import java.util.Collection;

import org.apache.hadoop.hbase.thrift.ThriftServerRunner.ImplType;
import org.apache.thrift.server.TNonblockingServer;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestNonblockingServerCmdLine extends ThriftServerCmdLineTestBase {

  @Parameters
  public static Collection<Object[]> getParameters() {
    return getParameters(TNonblockingServer.class, null);
  }

  public TestNonblockingServerCmdLine(ImplType implType, boolean specifyFramed,
      boolean specifyBindIP, boolean specifyCompact) {
    super(implType, specifyFramed, specifyBindIP, specifyCompact);
  }

}
