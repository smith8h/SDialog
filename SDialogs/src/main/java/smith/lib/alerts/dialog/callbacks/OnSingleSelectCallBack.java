/*
 *
 *   Created by Dev. Smith (Hussein Shakir) on 9/16/23, 10:07 PM
 *   Copyright Ⓒ 2023. All rights reserved Ⓒ 2023 http://github.com/smith8h
 *   Last modified: 8/6/23, 3:51 PM
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *                     You may obtain a copy of the License at
 *                  http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * /
 */

package smith.lib.alerts.dialog.callbacks;

/**
 * Single item selection callback to get the value selected.
 */
@FunctionalInterface
public interface OnSingleSelectCallBack {
    /**
     * triggered when selecting an item from the selection.
     *
     * @param itemId   the id of that selected item.
     * @param itemText the text of that selected item.
     */
    void onSelect(int itemId, String itemText);
}
