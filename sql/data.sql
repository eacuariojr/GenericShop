INSERT IGNORE INTO user VALUES (1, 'nook.tom@genericshop.com', 'Tom', '2021-03-30 17:00:00.000', 'Nook', '/images/blank_profile.png', "Uncle, realtor, shop owner: come to me for all your shopping needs." , '2021-01-01 09:00:00.000');
INSERT IGNORE INTO user VALUES (2, 'buyer@genericshop.com', 'Bob', '2021-04-19 13:05:23.000', 'Buyer', '/images/blank_profile.png', "I have a crippling shopping addiction and can't stop myself from getting more and more things. This is a real problem for me and has caused thousands of dollars to evaporate from my savings account." , '2021-01-02 04:02:34.000');
INSERT IGNORE INTO user VALUES (3, 'visitor@genericshop.com', 'Victor', '2021-01-03 12:52:32.000', 'Visitor', '/images/blank_profile.png', "This user has no bio" , '2021-01-03 12:56:51.543');

INSERT IGNORE INTO item_listing VALUES (1, 'A lovely mahogany table', 'images/pic01.jpg', '2021-01-03 12:56:51.543', 'Mahogany Table', '2021-01-01 10:00:00.000', "250.00", '5', 1);

INSERT IGNORE INTO item_review VALUES (1, '2021-02-14 15:23:40.000', 5, 'I got this chair to impress my valentine and she loved it!', 1, 2);