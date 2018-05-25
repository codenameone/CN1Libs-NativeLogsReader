/**
 * Native Logs Reader
 * Written in 2018 by Francesco Galgani, https://www.informatica-libera.net/
 *
 * To the extent possible under law, the author(s) have dedicated all copyright
 * and related and neighboring rights to this software to the public domain worldwide.
 * This software is distributed without any warranty.
 *
 * You should have received a copy of the CC0 Public Domain Dedication along
 * with this software. If not, see
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package net.informaticalibera.cn1.nativelogreader;

import com.codename1.system.NativeInterface;

/**
 * Native Code interface
 */
public interface NativeLogsReader extends NativeInterface {

    public void clearAndRestartLog();
    public String readLog();

}
