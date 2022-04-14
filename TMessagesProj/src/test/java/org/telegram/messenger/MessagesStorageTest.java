package org.telegram.messenger;

import org.junit.jupiter.api.Test;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;

class MessagesStorageTest {
    @Test
    void create_sqlite_table() throws SQLiteException {
        // given
        MessagesStorage messagesStorage = new MessagesStorage(1);

        // when
        messagesStorage.fwdCreateTable(new FakeSQLiteDatabase("some-file"), 90);

        // then
        // ?
    }
}

class FakeSQLiteDatabase extends SQLiteDatabase {
    public FakeSQLiteDatabase(String fileName) throws SQLiteException {
        super(fileName);
    }
}
