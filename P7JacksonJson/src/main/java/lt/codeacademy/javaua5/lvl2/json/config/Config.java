package lt.codeacademy.javaua5.lvl2.json.config;

import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Config {

	private String country;
	private String currency;
	private String bankIban;
	private String company;

	public Config() {
	}

	public String getCountry() {
		return country == null ? "N/A" : country;
	}

	public String getCurrency() {
		return currency;
	}

	public String getBankIban() {
		return bankIban;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Config.class.getSimpleName() + "[", "]")
				.add("country='" + country + "'")
				.add("currency='" + currency + "'")
				.add("bankIban='" + bankIban + "'")
				.add("company='" + company + "'")
				.toString();
	}
}
