package com.homedepot.interns;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {

	 
	 AddressTypeAhead_PERM, 
	 AisleInfoOnInStorePLPFeatureSwitch, 
	 AlphaPromptFeatureSwitch, 
	 AOLAddOrderExtractSchedulerFeature, 
	 AOLChangeZipCodeFeatureSwitch, 
	 AOLMultiVendorDeliveryFeatureSwitch, 
	 AOLOrderEntryRestServiceFeature, 
	 AOLSchedulerSelectedStoreListFeature, 
	 ApiDuplicateCookieRemovalFeature, 
	 ApiProxyFeatureSwitch, 
	 ApiStrSpclOrdersNonLegacyFeature, 
	 AppDeliveryChargeFeatureSwitchMAML, 
	 ApplATCCertonaAPIServiceFeature, 
	 ApplianceConfigurationFeatureSwitch, 
	 ApplianceCountyInfoFeature, 
	 ApplianceDeliveryChargeFeatureSwitch, 
	 ApplianceHookupSku, 
	 ApplianceInstallationSkus, 
	 AppliancePartsConfigItem, 
	 AppliancePitneyBowesFeature, 
	 AppliancePreCartFeatureSwitch, 
	 ApplianceRescheduleFeatureSwitch, 
	 ApplianceTwoStepInstallationSkus, 
	 APSAutomationFeatureSwitch, 
	 APSAutomationWCSPartFeatureSwitch, 
	 AssociateIdCaptureKillSwitch, 
	 AsyncOrderReceivedEmail, 
	 AsyncOrderSubmit, 
	 ATCOverlaySubtotalKillSwitch, 
	 AuroraCartCUDFeature, 
	 AuroraCartReadFeature, 
	 AuroraPromotionFeature, 
	 AuroraShippingDETAAvlCheckFS, 
	 AuroraShippingFallBackFeature, 
	 AuroraShippingFeatureSwitch, 
	 AuroraShippingNonTransactionFeature, 
	 AuroraVelocityTrackingFeature, 
	 BeehiveAuthReversalFeature, 
	 BeehiveFullAuthFeature, 
	 BeehiveHDCommCorruptFeatureSwitch, 
	 BeehiveHostControl, 
	 BeehiveServicesFeature, 
	 BigPLPImageFeatureSwitch, 
	 BloomReachRelatedSearchFeatureSwitch, 
	 BMSMClasses, 
	 BodfsDlvryCompareTime, 
	 BodfsFeature, 
	 BodfsNonLocalizationFeature, 
	 BodfsOrderLevelFreeShip, 
	 BODFSOrderSummaryFeature, 
	 BodfsReserveInventoryCapacityFeature, 
	 BodfsSameDayFeature, 
	 BopisFilterKillSwitch, 
	 BopisFraudForceHold, 
	 BopisFraudSkipCheck, 
	 BopisInventoryCallType, 
	 BopisOrderLevelFreeShip, 
	 BOPISReserveInventoryFeature, 
	 BopisTenderDeclineMaxCode, 
	 BopisTenderDeclineMinCode, 
	 BossBopisClPh1NewEmailContentFeature, 
	 BOSSBOPISOverlayNumOfCOMStores, 
	 BOSSBOPISOverlayRadius, 
	 BossDeliveryMaxDays, 
	 BossDeliveryMinDays, 
	 BossFreeShippingKillSwitchOn, 
	 BossFreeShippingPromoKillSwitchOn, 
	 BossKillSwitchOn, 
	 BossMapQuestKillSwitchOn, 
	 BossSharedFeature, 
	 BossSharedOverlayFeature, 
	 BROWSEAPP_CERTONA_RV2_KILL_SWITCH, 
	 BSSBatchFeatureSwitch, 
	 BURY_SKU_STATUS_400, 
	 BVCloudSeoPaginationSwitch, 
	 BVCloudSeoSwitch, 
	 CardCvvReqSaveFeature, 
	 CartCertonaRVServiceFeature, 
	 CartCertonaServicesFeature, 
	 CCA_ET_AES_KEY, 
	 CCA_ET_CALL, 
	 CCA_THD_AUTHORIZATION_DECLINED, 
	 CCA_THD_AUTHORIZATION_DECLINED_SEND, 
	 CCA_THD_BACKORDER, 
	 CCA_THD_BACKORDER_25, 
	 CCA_THD_BACKORDER_25_SEND, 
	 CCA_THD_BACKORDER_55, 
	 CCA_THD_BACKORDER_55_SEND, 
	 CCA_THD_BACKORDER_SEND, 
	 CCA_THD_BOSS_CANCEL, 
	 CCA_THD_BOSS_CANCEL_SEND, 
	 CCA_THD_CANCELED_ORDER, 
	 CCA_THD_CANCELED_ORDER_SEND, 
	 CCA_THD_CANCELED_VENDOR_ORDER, 
	 CCA_THD_CANCELED_VENDOR_ORDER_SEND, 
	 CCA_THD_CREDIT_MEMO, 
	 CCA_THD_CREDIT_MEMO_SEND, 
	 CCA_THD_DAMAGE_SEND, 
	 CCA_THD_REORDER_SHIP_CONFIRMATION, 
	 CCA_THD_REORDER_SHIP_SEND, 
	 CCA_THD_RETURNED_ITEMS_RECEIVED, 
	 CCA_THD_RETURNED_ITEMS_RECEIVED_SEND, 
	 CCA_THD_SHIP_CONFIRMATION, 
	 CCA_THD_SHIP_CONFIRMATION_SEND, 
	 CDAmrOrderFeatureSwitch, 
	 CertonaApplianceATCFeatureSwitch, 
	 CertonaCategoryKill, 
	 CertonaGlobalKill, 
	 CertonaGlobalKillMw, 
	 CertonaHomeKill, 
	 CertonaProductListKill, 
	 CertonaSearchKill, 
	 ChangeApplianceZipCodeFeatureSwitch, 
	 CiPixelKillSwitch, 
	 COMDynamicTypeAheadKillSwitch, 
	 COMInventoryServiceFeature, 
	 CompassPh4SterlingInvFeature, 
	 CompassPh4SterlingResvMode, 
	 CompassSplitOrderFeature, 
	 ComSterlingServiceFeature, 
	 CreditServicePromocodeMaxlength, 
	 CreditServicePromotionFeatureSwitch, 
	 CSREmailUpperFunctionSearchKS, 
	 CustomBlindsFeatureSwitch, 
	 CustomInventoryCalculationFeature, 
	 CustomSortKill, 
	 CUTOFFMSGTIME, 
	 CyberSourceBopisFraudFeatureSwitch, 
	 CybersourceFingerprintIdFeature, 
	 DDRelatedServicesDummyItem, 
	 DDRelatedServicesDummyItemFeature, 
	 DeadOrdersDelayMinutes, 
	 DisablePLCCBuyerNameCheck, 
	 DontCallInventoryForNalc, 
	 DormancyIsBopisOn, 
	 DPDVarnishCacheKillSwitch, 
	 EcoRebatesFeature, 
	 EdgeCacheKillTw, 
	 EnableLongDescriptionCOMFeature, 
	 EnableStoreCredit, 
	 ENDECA_UPGRADE_BATCH_SWITCH, 
	 ESVSOrderDetailsServiceOn, 
	 ESVSOrderSummaryServiceOn, 
	 ExcludeStoreAddress, 
	 ExpandDepCateKill, 
	 FetchCityStatesByZipCodeKillSwitch, 
	 FreeShippingRegistryClearCache, 
	 FreeShippingRegistryRefreshTime, 
	 FullAuthEmailFeature, 
	 FullAuthFeature, 
	 GCPCouponValidationFeature, 
	 GCPPromotionFallbackSwitch, 
	 GCPPromotionFeature, 
	 GCPPromtionRetrySwitch, 
	 GCPShippingDETAAvlCheckFS, 
	 GCPShippingFallBackFeature, 
	 GCPShippingFeatureSwitch, 
	 GCPShippingNonTransactionFeature, 
	 GCPShippingServiceRetryTxnFeature, 
	 GCPVelocityTrackingFallbackSwitch, 
	 GCPVelocityTrackingFeature, 
	 GlobalProXIntegrationFeature, 
	 GlobalUPSAddrValidationFeatureSwitch, 
	 HDPPFeatureSwitch, 
	 HFAPP_JAXB_STC_FLY_KILL_SWITCH, 
	 HFAPP_PRO_JSON_KILL_SWITCH, 
	 HFAppAutoLocalizationKillSwitch, 
	 HFAppKillSwitch, 
	 HFAppSignInBubbleKillSwitch, 
	 HFMobileTypeAhead, 
	 IgnoreBossCancelUpdateFromCOMFeature, 
	 ImplicitExpressCheckoutFeature, 
	 InstantRebatesFeatureSwitch, 
	 InstoreApplDeliveryRescheduleFeature, 
	 InternalSearchUseStarForPartial, 
	 IntlBillingFeatureSwitch, 
	 InventoryConnectionPoolFeature, 
	 InventoryKillSwitch, 
	 IrgGlobalKillMw, 
	 ItemLevelFreeShipEvent, 
	 JsCssPackingKillSwitch, 
	 KeysForAPICallsFeatureSwitch, 
	 KeywordFormattingFeature, 
	 MCC_TWC_AUTH_FILTER, 
	 MCC_TWS_AUTH_FILTER, 
	 MCCApplATCCertonaAPIServiceFeature, 
	 MCCAtcModalCoNowFeatureSwitch, 
	 MCCCartCertonaServicesFeature, 
	 MCCFullSiteFeatureSwitch, 
	 MCCMerchATCCertonaServicesFeature, 
	 MCCOrdConfirmCertonaFeature, 
	 MCCTabletFeatureSwitch, 
	 MccViewCartSpaFeature, 
	 mCommerceKillSwitch, 
	 McPipFeature, 
	 MerchATCCertonaServicesFeature, 
	 MinifyFeatureSwitch, 
	 MobileAddressTypeAheadKillSwitch, 
	 MobileAffiliatesKill, 
	 MobileAkamaiCacheKillSwitch, 
	 MobileFAQFeatureSwitch, 
	 MobilePBRulesLastTimeStamp, 
	 MobileV3CheckoutFeatureSwitch, 
	 MobileVarnishCacheKillSwitch, 
	 MobileWXSCacheKillSwitch, 
	 MWBannersKillSwitch, 
	 MWBingMapsFeatureSwitch, 
	 MWFastHomePageFeatureSwitch, 
	 MWInStoreDetectionKillSwitch, 
	 MWInStorePLPInventoryFeatureSwitch, 
	 MwPipBVReviewFeature, 
	 MwPipQandAFeature, 
	 MwProductV3Feature, 
	 MWStoreHoursKillSwitch, 
	 MwStoreReviewsFeature, 
	 MyAccountSOCCFeature, 
	 MyAcctAPIGuestOrderDetailsFeature, 
	 MyAcctBopisCancelFeatureSwitch, 
	 MyAcctBossPartialCancelFreature, 
	 MyAcctBVProfileKillSwitch, 
	 MyAcctCodServiceTabOn, 
	 MyAcctDataPurgeOrderDetailsFeature, 
	 MyAcctDataPurgeOrderSummaryFeature, 
	 MyAcctERecOrdTabOn, 
	 MyAcctERecPerfTabOn, 
	 MyAcctGridSVSOrderSummaryFeature, 
	 MyAcctOrdInfoFromAggrServiceMode, 
	 MyAcctPersistUserKillSwitch, 
	 MyAcctProgressPymtFeatureSwitch, 
	 MyAcctS2SOrdTabOn, 
	 MyAcctSelfServiceReturnFeatureSwitch, 
	 MyAcctShpServiceKillSwitch, 
	 MyAcctSVSOrdTabOn, 
	 MyAcctWriteReviewTabOn, 
	 MyacXrefAuditFeature, 
	 NewGuestOrderDetailsFeature, 
	 NewRightRailFeature, 
	 NLPFeatureSwitch, 
	 OMSCybersourceAuthFeature, 
	 OPCFeature_TEMP, 
	 OrdConfirmCertonaFeature, 
	 OrderConfirmationEmailFeatureSwitch, 
	 OrderConfRegisterDivOn, 
	 OrderItemMappingFeatureSwitch, 
	 OriginAcceptanceAddressFeature, 
	 PayPalExpressBOSSBOPISFeature, 
	 PayPalExpressKillSwitch, 
	 PayPalMajApplKsStat, 
	 PayPalMerchKsStat, 
	 PBRulesLastTimeStamp, 
	 PerformanceValuePricingFeatureSwitch, 
	 PIP2DeliveryDateKill, 
	 PIP2InventoryKill, 
	 PipAuroraShippingFeature, 
	 PipBvQaCloudSeoFeatureSwitch, 
	 PipBvQaDisplayFeatureSwitch, 
	 PipBvRrCloudSeoFeatureSwitch, 
	 PipBvRrDisplayFeatureSwitch, 
	 PipCertonaOnDemandFeature, 
	 PipFbtFeatureSwitch, 
	 PipFeatureBasedRecommendationsSwitch, 
	 PipFullsiteOnTabletFeature, 
	 PipPaypalFeature, 
	 PipSearchNav2BannerFeatureSwitch, 
	 PipSmmltFeatureSwitch, 
	 PipTextAisleBayFeatureSwitch, 
	 PipTrackIfFeature, 
	 PLCCXrefNumToCreditServicesFS, 
	 PLP2MCBFeatureSwitch, 
	 PriceConsolidatedKillSwitch, 
	 PriceInfoFeatureSwitch, 
	 PriceInfoMAMLFeatureSwitch, 
	 PriceScheduleFlag, 
	 ProcessLineNbrInorderSubmitFeature, 
	 ProdApiAlphaPromptFeatureSwitch, 
	 ProdApiAuroraPromoFeatureSwitch, 
	 ProdApiAuroraShipFeatureSwitch, 
	 ProductApiAuroraShippingKillSwitch, 
	 ProductDataServiceAttributeFS, 
	 PromotionOnRightRailFeature_TEMP, 
	 PromotionServiceFeatureSwitch, 
	 ProXIntegrationFeature, 
	 ProXLinkAccountFeature, 
	 ProXLinkAccountPageFeature, 
	 ProXPurchaseJumpLinkFeature, 
	 RAPID_SKU_BATCH_ON, 
	 RAPIDSKUFEATURESWITCH, 
	 ReCaptchaFeatureSwitch_TEMP, 
	 RegistrationLiteFeature, 
	 RelatedSearchKill, 
	 ReturnWindowSwitch, 
	 RTPFeatureSwitch, 
	 RTPFeatureSwitch_Pilot2, 
	 RVOnDemandShowMoreFeatureSwitch, 
	 SaveTripKillSwitch, 
	 SearchCustomMessagingKill, 
	 SearchNavApiAuroraShippingKillSwitch, 
	 SearchNavNLPCloudServiceFeature, 
	 SendAdditionalBossInfoToCOMFeature, 
	 SendSTHInMixedOrdersToCOMFeature, 
	 SendSTHOnlyOrdersToCOMFeature, 
	 SEOFeatureSwitch, 
	 SEOKillSwitch, 
	 SharableListKillSwitch, 
	 ShippingMessageFeatureSwitch, 
	 ShippingServiceSwitch, 
	 ShippingServiceWithDetaFeature, 
	 SkipApplianceAuth, 
	 SkipCaptchaValidationGC, 
	 SterlingFulfBOSSOnly, 
	 SterlingFulfBOSSOnlyOrdersThrottle, 
	 SterlingFulfEmailWhitelistFeature, 
	 SterlingFulfMixedMerch, 
	 SterlingFulfMixedOrdersThrottle, 
	 SterlingFulfSTHOnly, 
	 SterlingFulfSTHOnlyOrdersThrottle, 
	 SterlingResvForTestOrdersFeature, 
	 StoreCreditProgramCode, 
	 StoreInfoServiceFeatureSwitch, 
	 StrNbrViaHeaderFeatureSwitch, 
	 TabletBlindsHostFeatureSwitch, 
	 TaxwareFeatureSwitch, 
	 TestCreditCardNumber, 
	 THDLookupLastPartialTimeStamp, 
	 THRESHOLDSMSTIME, 
	 TOPSELLERS_SALES_DAYS, 
	 TrackYourTruckDivOn, 
	 TransmitEntryBasedCOMScheduler, 
	 TwSuperSkuKillSwitch, 
	 TxtMsgKillSwitch, 
	 UPSAddressValidationStatesConfig, 
	 UseAPIToDecrementInventory, 
	 UseNewProdCellFeature, 
	 UseOOBCheckInventory, 
	 UserPrefKillSwitch, 
	 UseSecureGCTandemURL, 
	 ValuePricingFeatureSwitch, 
	 VendorAddressFeature, 
	 VisualNavDisplayOn, 
	 VoltageB2BEFeature, 
	 VoltageCDAFeature, 
	 VoltageHDFeature, 
	 VoltageKioskFeature, 
	 VoltageMAMLFeature, 
	 VoltageMobileFeature, 
	 VoltageProAppFeature, 
	 VoltagePSFeature, 
	 VoltageTabletFeature, 
	 VoltageTSFeature, 
	 VoltageWebFeature, 
	 WCSPriceFeatureSwitch, 
	 WebAkamaiCachingON, 
	 WXSBossBopisCachingFeature, 
	 XREFCardNumberToOMS, 
	 ZeroDollarAuthFeature, 
	StratificationKill;
	
	
	 

	    public boolean isActive() {
	        return FeatureContext.getFeatureManager().isActive(this);
	    }
	
}
