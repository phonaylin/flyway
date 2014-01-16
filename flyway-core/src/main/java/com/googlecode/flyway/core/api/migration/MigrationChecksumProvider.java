/**
 * Copyright 2010-2014 Axel Fontaine and the many contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.flyway.core.api.migration;

/**
 * Migration implementors that also implement this interface will be able to specify their checksum (for
 * validation), instead of having it automatically computed or default to {@code null} (for Java Migrations).
 */
public interface MigrationChecksumProvider {
    /**
     * Computes the checksum of the migration.
     *
     * @return The checksum of the migration.
     */
    Integer getChecksum();
}
