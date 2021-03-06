package yawei.sportal;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Sportal extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("login")) {
            String message = args.getString(0);
            this.login(message, callbackContext);
            return true;
        }
        else if (action.equals("logout")) {
            this.logout(callbackContext);
            return true;
        }

        return false;
    }

    private void login(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success("login:" + message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void logout(CallbackContext callbackContext) {
        callbackContext.success();
    }
}
