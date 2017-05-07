package sanskritcode.subhashita_pratimala;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.Header;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import sanskritnlp.transliteration.transliterator;

/**
 * Flow: Setup::OnCreate ->  listGetter -> (user chooses lists, checkboxListener) -> buttonPressed1 ->
 * GetSubhAShitasActivity
 */

public class Setup extends AppCompatActivity {
    private static final String index_indexorum = "https://raw.githubusercontent.com/sanskrit-coders/subhAShita-db-sanskrit/master/subhAShitaLists.md";
    protected static AsyncHttpClient asyncHttpClient = new AsyncHttpClient();

    public static List<String> indexUrls = new ArrayList<String>();
    public static HashSet<String> indexesSelected = new HashSet<String>();

    private TextView topText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // asyncHttpClient.getHttpClient().getParams().setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        topText = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setText(getString(R.string.buttonWorking));
        button.append(transliterator.transliterate("hari", "iast", "dev"));
        button.setEnabled(false);

        asyncHttpClient.get(Setup.index_indexorum, new TextHttpResponseHandler() {
            private String INDEX_GETTER = "IndexGetter";
            @Override
            public void onStart() {
                // Initiated the request
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseBody) {
                String[] lines = responseBody.split("\n");
                for (String line: lines) {
                    String url = line.replace("<", "").replace(">", "");
                    indexUrls.add(url);
                    Log.d(INDEX_GETTER, "Got: " + url);
                }
                // retainOnlyOneDictForDebugging();
                LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
                for (String index: indexUrls) {
                    CheckBox cb = new CheckBox(getApplicationContext());
                    cb.setText(index);
                    cb.setTextColor(Color.BLACK);
                    cb.setChecked(true);
                    cb.setOnCheckedChangeListener(checkboxListener);
                    indexesSelected.add(index);
                    layout.addView(cb, layout.getChildCount());
                }
                button.setText(getString(R.string.proceed_button));
                button.setEnabled(true);
                // getDictionaries(0);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseBody, Throwable e) {
                // Response failed :(
                topText.setText("Alas! Failed to get the subhAShita list.");
            }

            @Override
            public void onFinish() {
                // Completed the request (either success or failure)
            }
        });

    }

    public void buttonPressed1(View v) {
        button.setText(getString(R.string.buttonWorking));
        button.setEnabled(false);
        // Intent intent = new Intent(this, GetUrlActivity.class);
        // intent.putStringArrayListExtra();
        // startActivity(intent);
    }

    CompoundButton.OnCheckedChangeListener checkboxListener = new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                indexesSelected.add(buttonView.getText().toString());
            } else {
                indexesSelected.remove(buttonView.getText().toString());
            }
        }
    };
}
