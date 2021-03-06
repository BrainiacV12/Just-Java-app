package com.android.example.justjava;



import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	/**
	 * This method is called when the order button is clicked.
	 */
	public void submitOrder(View view) {
		int price = calculatePrice();
		createOrderSummary(price);

	}

	int quantity = 0;

	/**
	 * Calculates the price of the order
	 *
	 * @return total price
	 */
	public int calculatePrice(){
		int price = quantity * 5;
		return price;
	}

	/**
	 * This method create the order summary
	 * and prints the message
	 */
	public String createOrderSummary( int price){
		String priceMessage = "Name: Sunu Eric Elikplim";
		priceMessage += "\nQuantity: " + quantity;
		priceMessage += "\nTotal: $" + price + "\nThank you!";
		displayMessage(priceMessage);
		return priceMessage;
	}

	/**
	 * This method increases the  quantity value on the screen.
	 */

	public void increment(View view) {
		quantity += 1;
		displayQuantity(quantity);
	}

	/**
	 * This method decreases the quantity value on the screen.
	 */

		public void decrement (View view){
		quantity -= 1;
		displayQuantity(quantity);}


	/**
	 * This method displays the given quantity value on the screen.
	 */
	private void displayQuantity(int number) {
		TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
		quantityTextView.setText("" + number);
	}


	/**
	 * This method displays the given text on the screen.
	 */
	private void displayMessage(String message) {
		TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
		orderSummaryTextView.setText(message);
	}
}