package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText numberInput;
	int angka;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		numberInput = findViewById(R.id.number_input);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		angka = (int) (1+(Math.random()*100));
//		Random rnd = new Random();
//		angka = rnd.nextInt(100) + 1;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String input = numberInput.getText().toString();
		int number = Integer.parseInt(input);
		if(number == angka){
			Toast.makeText(this, "Tebakan Anda Benar!", Toast.LENGTH_SHORT).show();
		} else if(number < angka){
			Toast.makeText(this, "Tebakan Anda Lebih Kecil!", Toast.LENGTH_SHORT).show();
		} else if(number > angka){
			Toast.makeText(this, "Tebakan Anda Lebih Besar!", Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		numberInput.setText("");
		initRandomNumber();
	}
}
