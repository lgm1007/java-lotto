package controller;

import validator.AmountValidator;

public class AmountRequest {
	private final int lottoAmount;

	private static final int LOTTO_PRICE = 1000;

	private AmountRequest(final int lottoAmount) {
		this.lottoAmount = lottoAmount;
	}

	public static AmountRequest of(final int lottoAmount) {
		AmountValidator.validateAmountNegative(lottoAmount);
		return new AmountRequest(lottoAmount);
	}

	public int getLottoAmount() {
		return this.lottoAmount;
	}

	public int fetchPhraseLottoCount() {
		return (int) this.lottoAmount / LOTTO_PRICE;
	}
}
