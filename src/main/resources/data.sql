DROP TABLE IF EXISTS donations;
CREATE TABLE donations (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  comment TEXT NOT NULL,
  image_url VARCHAR(250) NOT NULL,
  quantity INT NOT NULL,
  gender ENUM('BOY', 'GIRL', 'MIXTED') NOT NULL,
  state ENUM('NEW', 'GOOD_STATE'),
  age ENUM('ONE_YEAR_AND_LESS', 'THREE_YEAR', 'SIX_YEAR', 'NINE_YEAR_AND_MORE'),
  size ENUM('ONE_MONTH', 'THREE_MONTH', 'SIX_MONTH', 'NINE_MONTH', 'TWELVE_MONTH', 'EIGHTEEN_MONTH', 'TWENTY_FOUR_MONTH', 'THREE_YEARS', 'FOUR_YEARS', 'FIVE_YEARS', 'SIX_YEAR', 'SEVEN_YEARS', 'EIGHT_YEARS', 'NINE_YEARS', 'TEN_YEARS', 'ELEVEN_YEARS', 'TWELVE_YEARS'),
  date_expiration VARCHAR(250),
  category ENUM('BATH_PRODUCTS', 'SKIN_CARE', 'DIAPERING_PRODUCTS', 'HAIR_CARE', 'ORAL_HYGIENE', 'NAIL_CARE', 'EAR_AND_NOSE_CARE', 'BATH_ACCESSORIES', 'WELLNESS_AND_GROOMING_PRODUCTS'),
  type_donation VARCHAR(250) NOT NULL
);

INSERT INTO donations (name, comment, image_url, quantity, gender, state, age, size, date_expiration, category, type_donation)
VALUES ('verre', 'Lorem ipsum blablalba', 'https://pixabay.com/photos/water-fresh-clear-summer-drops-2559064/', 5, 'MIXTED', 'NEW', 'NINE_YEAR_AND_MORE', 'ONE_MONTH', 'DATEXPIRATION', 'WELLNESS_AND_GROOMING_PRODUCTS', 'TOY');