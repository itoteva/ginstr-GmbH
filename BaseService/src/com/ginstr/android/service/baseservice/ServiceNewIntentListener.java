/**
 * Copyright 2014 ginstr GmbH
 * 
 * This work is licensed under the Creative Commons Attribution-NonCommercial 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/ 
 *  
 *  Unless required by applicable law or agreed to in writing, software 
 *  distributed under the License is distributed on an "AS IS" BASIS, 
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *  See the License for the specific language governing permissions and 
 *  limitations under the License. 
 */
package com.ginstr.android.service.baseservice;

import android.content.Intent;

/**
* Interface to be implemented by service OnNewIntent listeners.
* @author Alessandro Valbonesi
* @version 1.0
*/
public interface ServiceNewIntentListener {
	/**
	 * Invoked when the service receives a OnNewIntent lifecycle call by the Activity.
     * @param newIntent new Intent received by the calling Activity
	 */
    void onServiceNewIntent(Intent newIntent);

}
