package util;

/**
 * @author acmore
 * @since JDK1.8
 * created at 2018/5/3
 */
public interface Parameter {

    int MAX_BLOCK_SIZE = 100;
    int MAIN_CHAIN_INDEX = 0;
    int COINBASE_MATURITY = 6;
    long MONEY_PER_COIN = 10000000;
    long TOTAL_COINS = 21000000;
    int MINE_TIME_BETWEEN_BLOCKS = 60;
    int DIFFICULTY_PERIOD = 60 * 60 * 10;
    int INITIAL_DIFFICULTY = 20;
    int INITIAL_COIN_SUBSIDY = 50;
    int HALF_SUBSIDY_AFTER_BLOCK_NUM = 210000;
    int MAX_HALF_RATIO = 64;
    String DEFAULT_WALLET_PATH = "data/wallet.dat";

    long MAX_MONEY = MONEY_PER_COIN * TOTAL_COINS;
    int DIFFICULTY_PERIOD_IN_BLOCKS = DIFFICULTY_PERIOD / MINE_TIME_BETWEEN_BLOCKS;
}
