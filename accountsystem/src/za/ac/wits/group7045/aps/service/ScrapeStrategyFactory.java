package za.ac.wits.group7045.aps.service;

import za.ac.wits.scraper.dto.ScrapeRequest;

public interface ScrapeStrategyFactory {

	public ScrapeHandlerStrategy getAccountScrapeStrategy (ScrapeRequest scrapeRequest);
}
