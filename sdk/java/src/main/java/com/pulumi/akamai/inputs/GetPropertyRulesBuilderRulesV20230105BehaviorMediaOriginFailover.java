// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover();

    @Import(name="cacheErrorResponse")
    private @Nullable Boolean cacheErrorResponse;

    public Optional<Boolean> cacheErrorResponse() {
        return Optional.ofNullable(this.cacheErrorResponse);
    }

    @Import(name="cacheWindow")
    private @Nullable String cacheWindow;

    public Optional<String> cacheWindow() {
        return Optional.ofNullable(this.cacheWindow);
    }

    @Import(name="clientResponseCode")
    private @Nullable String clientResponseCode;

    public Optional<String> clientResponseCode() {
        return Optional.ofNullable(this.clientResponseCode);
    }

    @Import(name="detectObjectUnavailable")
    private @Nullable Boolean detectObjectUnavailable;

    public Optional<Boolean> detectObjectUnavailable() {
        return Optional.ofNullable(this.detectObjectUnavailable);
    }

    @Import(name="detectObjectUnavailableTitle")
    private @Nullable String detectObjectUnavailableTitle;

    public Optional<String> detectObjectUnavailableTitle() {
        return Optional.ofNullable(this.detectObjectUnavailableTitle);
    }

    @Import(name="detectOriginUnavailable")
    private @Nullable Boolean detectOriginUnavailable;

    public Optional<Boolean> detectOriginUnavailable() {
        return Optional.ofNullable(this.detectOriginUnavailable);
    }

    @Import(name="detectOriginUnavailableTitle")
    private @Nullable String detectOriginUnavailableTitle;

    public Optional<String> detectOriginUnavailableTitle() {
        return Optional.ofNullable(this.detectOriginUnavailableTitle);
    }

    @Import(name="detectOriginUnresponsive")
    private @Nullable Boolean detectOriginUnresponsive;

    public Optional<Boolean> detectOriginUnresponsive() {
        return Optional.ofNullable(this.detectOriginUnresponsive);
    }

    @Import(name="detectOriginUnresponsiveTitle")
    private @Nullable String detectOriginUnresponsiveTitle;

    public Optional<String> detectOriginUnresponsiveTitle() {
        return Optional.ofNullable(this.detectOriginUnresponsiveTitle);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="objectUnavailableAlternateHost")
    private @Nullable String objectUnavailableAlternateHost;

    public Optional<String> objectUnavailableAlternateHost() {
        return Optional.ofNullable(this.objectUnavailableAlternateHost);
    }

    @Import(name="objectUnavailableBackupHost")
    private @Nullable String objectUnavailableBackupHost;

    public Optional<String> objectUnavailableBackupHost() {
        return Optional.ofNullable(this.objectUnavailableBackupHost);
    }

    @Import(name="objectUnavailableBlacklistOriginIp")
    private @Nullable Boolean objectUnavailableBlacklistOriginIp;

    public Optional<Boolean> objectUnavailableBlacklistOriginIp() {
        return Optional.ofNullable(this.objectUnavailableBlacklistOriginIp);
    }

    @Import(name="objectUnavailableBlacklistWindow")
    private @Nullable String objectUnavailableBlacklistWindow;

    public Optional<String> objectUnavailableBlacklistWindow() {
        return Optional.ofNullable(this.objectUnavailableBlacklistWindow);
    }

    @Import(name="objectUnavailableChangeProtocol")
    private @Nullable Boolean objectUnavailableChangeProtocol;

    public Optional<Boolean> objectUnavailableChangeProtocol() {
        return Optional.ofNullable(this.objectUnavailableChangeProtocol);
    }

    @Import(name="objectUnavailableDetectionLevel")
    private @Nullable String objectUnavailableDetectionLevel;

    public Optional<String> objectUnavailableDetectionLevel() {
        return Optional.ofNullable(this.objectUnavailableDetectionLevel);
    }

    @Import(name="objectUnavailableIncludeQueryString")
    private @Nullable Boolean objectUnavailableIncludeQueryString;

    public Optional<Boolean> objectUnavailableIncludeQueryString() {
        return Optional.ofNullable(this.objectUnavailableIncludeQueryString);
    }

    @Import(name="objectUnavailableModifiedPath")
    private @Nullable String objectUnavailableModifiedPath;

    public Optional<String> objectUnavailableModifiedPath() {
        return Optional.ofNullable(this.objectUnavailableModifiedPath);
    }

    @Import(name="objectUnavailableModifyRequestPath")
    private @Nullable Boolean objectUnavailableModifyRequestPath;

    public Optional<Boolean> objectUnavailableModifyRequestPath() {
        return Optional.ofNullable(this.objectUnavailableModifyRequestPath);
    }

    @Import(name="objectUnavailableProtocol")
    private @Nullable String objectUnavailableProtocol;

    public Optional<String> objectUnavailableProtocol() {
        return Optional.ofNullable(this.objectUnavailableProtocol);
    }

    @Import(name="objectUnavailableRecovery")
    private @Nullable String objectUnavailableRecovery;

    public Optional<String> objectUnavailableRecovery() {
        return Optional.ofNullable(this.objectUnavailableRecovery);
    }

    @Import(name="objectUnavailableRedirectMethod")
    private @Nullable Integer objectUnavailableRedirectMethod;

    public Optional<Integer> objectUnavailableRedirectMethod() {
        return Optional.ofNullable(this.objectUnavailableRedirectMethod);
    }

    @Import(name="objectUnavailableResponseCodes")
    private @Nullable List<String> objectUnavailableResponseCodes;

    public Optional<List<String>> objectUnavailableResponseCodes() {
        return Optional.ofNullable(this.objectUnavailableResponseCodes);
    }

    @Import(name="objectUnavailableRetryLimit")
    private @Nullable String objectUnavailableRetryLimit;

    public Optional<String> objectUnavailableRetryLimit() {
        return Optional.ofNullable(this.objectUnavailableRetryLimit);
    }

    @Import(name="originUnavailableAlternateHost")
    private @Nullable String originUnavailableAlternateHost;

    public Optional<String> originUnavailableAlternateHost() {
        return Optional.ofNullable(this.originUnavailableAlternateHost);
    }

    @Import(name="originUnavailableBackupHost")
    private @Nullable String originUnavailableBackupHost;

    public Optional<String> originUnavailableBackupHost() {
        return Optional.ofNullable(this.originUnavailableBackupHost);
    }

    @Import(name="originUnavailableBlacklistOriginIp")
    private @Nullable Boolean originUnavailableBlacklistOriginIp;

    public Optional<Boolean> originUnavailableBlacklistOriginIp() {
        return Optional.ofNullable(this.originUnavailableBlacklistOriginIp);
    }

    @Import(name="originUnavailableBlacklistWindow")
    private @Nullable String originUnavailableBlacklistWindow;

    public Optional<String> originUnavailableBlacklistWindow() {
        return Optional.ofNullable(this.originUnavailableBlacklistWindow);
    }

    @Import(name="originUnavailableChangeProtocol")
    private @Nullable Boolean originUnavailableChangeProtocol;

    public Optional<Boolean> originUnavailableChangeProtocol() {
        return Optional.ofNullable(this.originUnavailableChangeProtocol);
    }

    @Import(name="originUnavailableDetectionLevel")
    private @Nullable String originUnavailableDetectionLevel;

    public Optional<String> originUnavailableDetectionLevel() {
        return Optional.ofNullable(this.originUnavailableDetectionLevel);
    }

    @Import(name="originUnavailableIncludeQueryString")
    private @Nullable Boolean originUnavailableIncludeQueryString;

    public Optional<Boolean> originUnavailableIncludeQueryString() {
        return Optional.ofNullable(this.originUnavailableIncludeQueryString);
    }

    @Import(name="originUnavailableModifiedPath")
    private @Nullable String originUnavailableModifiedPath;

    public Optional<String> originUnavailableModifiedPath() {
        return Optional.ofNullable(this.originUnavailableModifiedPath);
    }

    @Import(name="originUnavailableModifyRequestPath")
    private @Nullable Boolean originUnavailableModifyRequestPath;

    public Optional<Boolean> originUnavailableModifyRequestPath() {
        return Optional.ofNullable(this.originUnavailableModifyRequestPath);
    }

    @Import(name="originUnavailableProtocol")
    private @Nullable String originUnavailableProtocol;

    public Optional<String> originUnavailableProtocol() {
        return Optional.ofNullable(this.originUnavailableProtocol);
    }

    @Import(name="originUnavailableRecovery")
    private @Nullable String originUnavailableRecovery;

    public Optional<String> originUnavailableRecovery() {
        return Optional.ofNullable(this.originUnavailableRecovery);
    }

    @Import(name="originUnavailableRedirectMethod")
    private @Nullable Integer originUnavailableRedirectMethod;

    public Optional<Integer> originUnavailableRedirectMethod() {
        return Optional.ofNullable(this.originUnavailableRedirectMethod);
    }

    @Import(name="originUnavailableResponseCodes")
    private @Nullable List<String> originUnavailableResponseCodes;

    public Optional<List<String>> originUnavailableResponseCodes() {
        return Optional.ofNullable(this.originUnavailableResponseCodes);
    }

    @Import(name="originUnavailableRetryLimit")
    private @Nullable String originUnavailableRetryLimit;

    public Optional<String> originUnavailableRetryLimit() {
        return Optional.ofNullable(this.originUnavailableRetryLimit);
    }

    @Import(name="originUnresponsiveAlternateHost")
    private @Nullable String originUnresponsiveAlternateHost;

    public Optional<String> originUnresponsiveAlternateHost() {
        return Optional.ofNullable(this.originUnresponsiveAlternateHost);
    }

    @Import(name="originUnresponsiveBackupHost")
    private @Nullable String originUnresponsiveBackupHost;

    public Optional<String> originUnresponsiveBackupHost() {
        return Optional.ofNullable(this.originUnresponsiveBackupHost);
    }

    @Import(name="originUnresponsiveBlacklistOriginIp")
    private @Nullable Boolean originUnresponsiveBlacklistOriginIp;

    public Optional<Boolean> originUnresponsiveBlacklistOriginIp() {
        return Optional.ofNullable(this.originUnresponsiveBlacklistOriginIp);
    }

    @Import(name="originUnresponsiveBlacklistWindow")
    private @Nullable String originUnresponsiveBlacklistWindow;

    public Optional<String> originUnresponsiveBlacklistWindow() {
        return Optional.ofNullable(this.originUnresponsiveBlacklistWindow);
    }

    @Import(name="originUnresponsiveChangeProtocol")
    private @Nullable Boolean originUnresponsiveChangeProtocol;

    public Optional<Boolean> originUnresponsiveChangeProtocol() {
        return Optional.ofNullable(this.originUnresponsiveChangeProtocol);
    }

    @Import(name="originUnresponsiveDetectionLevel")
    private @Nullable String originUnresponsiveDetectionLevel;

    public Optional<String> originUnresponsiveDetectionLevel() {
        return Optional.ofNullable(this.originUnresponsiveDetectionLevel);
    }

    @Import(name="originUnresponsiveIncludeQueryString")
    private @Nullable Boolean originUnresponsiveIncludeQueryString;

    public Optional<Boolean> originUnresponsiveIncludeQueryString() {
        return Optional.ofNullable(this.originUnresponsiveIncludeQueryString);
    }

    @Import(name="originUnresponsiveModifiedPath")
    private @Nullable String originUnresponsiveModifiedPath;

    public Optional<String> originUnresponsiveModifiedPath() {
        return Optional.ofNullable(this.originUnresponsiveModifiedPath);
    }

    @Import(name="originUnresponsiveModifyRequestPath")
    private @Nullable Boolean originUnresponsiveModifyRequestPath;

    public Optional<Boolean> originUnresponsiveModifyRequestPath() {
        return Optional.ofNullable(this.originUnresponsiveModifyRequestPath);
    }

    @Import(name="originUnresponsiveProtocol")
    private @Nullable String originUnresponsiveProtocol;

    public Optional<String> originUnresponsiveProtocol() {
        return Optional.ofNullable(this.originUnresponsiveProtocol);
    }

    @Import(name="originUnresponsiveRecovery")
    private @Nullable String originUnresponsiveRecovery;

    public Optional<String> originUnresponsiveRecovery() {
        return Optional.ofNullable(this.originUnresponsiveRecovery);
    }

    @Import(name="originUnresponsiveRedirectMethod")
    private @Nullable Integer originUnresponsiveRedirectMethod;

    public Optional<Integer> originUnresponsiveRedirectMethod() {
        return Optional.ofNullable(this.originUnresponsiveRedirectMethod);
    }

    @Import(name="originUnresponsiveRetryLimit")
    private @Nullable String originUnresponsiveRetryLimit;

    public Optional<String> originUnresponsiveRetryLimit() {
        return Optional.ofNullable(this.originUnresponsiveRetryLimit);
    }

    @Import(name="otherOptions")
    private @Nullable String otherOptions;

    public Optional<String> otherOptions() {
        return Optional.ofNullable(this.otherOptions);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover(GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover $) {
        this.cacheErrorResponse = $.cacheErrorResponse;
        this.cacheWindow = $.cacheWindow;
        this.clientResponseCode = $.clientResponseCode;
        this.detectObjectUnavailable = $.detectObjectUnavailable;
        this.detectObjectUnavailableTitle = $.detectObjectUnavailableTitle;
        this.detectOriginUnavailable = $.detectOriginUnavailable;
        this.detectOriginUnavailableTitle = $.detectOriginUnavailableTitle;
        this.detectOriginUnresponsive = $.detectOriginUnresponsive;
        this.detectOriginUnresponsiveTitle = $.detectOriginUnresponsiveTitle;
        this.locked = $.locked;
        this.objectUnavailableAlternateHost = $.objectUnavailableAlternateHost;
        this.objectUnavailableBackupHost = $.objectUnavailableBackupHost;
        this.objectUnavailableBlacklistOriginIp = $.objectUnavailableBlacklistOriginIp;
        this.objectUnavailableBlacklistWindow = $.objectUnavailableBlacklistWindow;
        this.objectUnavailableChangeProtocol = $.objectUnavailableChangeProtocol;
        this.objectUnavailableDetectionLevel = $.objectUnavailableDetectionLevel;
        this.objectUnavailableIncludeQueryString = $.objectUnavailableIncludeQueryString;
        this.objectUnavailableModifiedPath = $.objectUnavailableModifiedPath;
        this.objectUnavailableModifyRequestPath = $.objectUnavailableModifyRequestPath;
        this.objectUnavailableProtocol = $.objectUnavailableProtocol;
        this.objectUnavailableRecovery = $.objectUnavailableRecovery;
        this.objectUnavailableRedirectMethod = $.objectUnavailableRedirectMethod;
        this.objectUnavailableResponseCodes = $.objectUnavailableResponseCodes;
        this.objectUnavailableRetryLimit = $.objectUnavailableRetryLimit;
        this.originUnavailableAlternateHost = $.originUnavailableAlternateHost;
        this.originUnavailableBackupHost = $.originUnavailableBackupHost;
        this.originUnavailableBlacklistOriginIp = $.originUnavailableBlacklistOriginIp;
        this.originUnavailableBlacklistWindow = $.originUnavailableBlacklistWindow;
        this.originUnavailableChangeProtocol = $.originUnavailableChangeProtocol;
        this.originUnavailableDetectionLevel = $.originUnavailableDetectionLevel;
        this.originUnavailableIncludeQueryString = $.originUnavailableIncludeQueryString;
        this.originUnavailableModifiedPath = $.originUnavailableModifiedPath;
        this.originUnavailableModifyRequestPath = $.originUnavailableModifyRequestPath;
        this.originUnavailableProtocol = $.originUnavailableProtocol;
        this.originUnavailableRecovery = $.originUnavailableRecovery;
        this.originUnavailableRedirectMethod = $.originUnavailableRedirectMethod;
        this.originUnavailableResponseCodes = $.originUnavailableResponseCodes;
        this.originUnavailableRetryLimit = $.originUnavailableRetryLimit;
        this.originUnresponsiveAlternateHost = $.originUnresponsiveAlternateHost;
        this.originUnresponsiveBackupHost = $.originUnresponsiveBackupHost;
        this.originUnresponsiveBlacklistOriginIp = $.originUnresponsiveBlacklistOriginIp;
        this.originUnresponsiveBlacklistWindow = $.originUnresponsiveBlacklistWindow;
        this.originUnresponsiveChangeProtocol = $.originUnresponsiveChangeProtocol;
        this.originUnresponsiveDetectionLevel = $.originUnresponsiveDetectionLevel;
        this.originUnresponsiveIncludeQueryString = $.originUnresponsiveIncludeQueryString;
        this.originUnresponsiveModifiedPath = $.originUnresponsiveModifiedPath;
        this.originUnresponsiveModifyRequestPath = $.originUnresponsiveModifyRequestPath;
        this.originUnresponsiveProtocol = $.originUnresponsiveProtocol;
        this.originUnresponsiveRecovery = $.originUnresponsiveRecovery;
        this.originUnresponsiveRedirectMethod = $.originUnresponsiveRedirectMethod;
        this.originUnresponsiveRetryLimit = $.originUnresponsiveRetryLimit;
        this.otherOptions = $.otherOptions;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover(Objects.requireNonNull(defaults));
        }

        public Builder cacheErrorResponse(@Nullable Boolean cacheErrorResponse) {
            $.cacheErrorResponse = cacheErrorResponse;
            return this;
        }

        public Builder cacheWindow(@Nullable String cacheWindow) {
            $.cacheWindow = cacheWindow;
            return this;
        }

        public Builder clientResponseCode(@Nullable String clientResponseCode) {
            $.clientResponseCode = clientResponseCode;
            return this;
        }

        public Builder detectObjectUnavailable(@Nullable Boolean detectObjectUnavailable) {
            $.detectObjectUnavailable = detectObjectUnavailable;
            return this;
        }

        public Builder detectObjectUnavailableTitle(@Nullable String detectObjectUnavailableTitle) {
            $.detectObjectUnavailableTitle = detectObjectUnavailableTitle;
            return this;
        }

        public Builder detectOriginUnavailable(@Nullable Boolean detectOriginUnavailable) {
            $.detectOriginUnavailable = detectOriginUnavailable;
            return this;
        }

        public Builder detectOriginUnavailableTitle(@Nullable String detectOriginUnavailableTitle) {
            $.detectOriginUnavailableTitle = detectOriginUnavailableTitle;
            return this;
        }

        public Builder detectOriginUnresponsive(@Nullable Boolean detectOriginUnresponsive) {
            $.detectOriginUnresponsive = detectOriginUnresponsive;
            return this;
        }

        public Builder detectOriginUnresponsiveTitle(@Nullable String detectOriginUnresponsiveTitle) {
            $.detectOriginUnresponsiveTitle = detectOriginUnresponsiveTitle;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder objectUnavailableAlternateHost(@Nullable String objectUnavailableAlternateHost) {
            $.objectUnavailableAlternateHost = objectUnavailableAlternateHost;
            return this;
        }

        public Builder objectUnavailableBackupHost(@Nullable String objectUnavailableBackupHost) {
            $.objectUnavailableBackupHost = objectUnavailableBackupHost;
            return this;
        }

        public Builder objectUnavailableBlacklistOriginIp(@Nullable Boolean objectUnavailableBlacklistOriginIp) {
            $.objectUnavailableBlacklistOriginIp = objectUnavailableBlacklistOriginIp;
            return this;
        }

        public Builder objectUnavailableBlacklistWindow(@Nullable String objectUnavailableBlacklistWindow) {
            $.objectUnavailableBlacklistWindow = objectUnavailableBlacklistWindow;
            return this;
        }

        public Builder objectUnavailableChangeProtocol(@Nullable Boolean objectUnavailableChangeProtocol) {
            $.objectUnavailableChangeProtocol = objectUnavailableChangeProtocol;
            return this;
        }

        public Builder objectUnavailableDetectionLevel(@Nullable String objectUnavailableDetectionLevel) {
            $.objectUnavailableDetectionLevel = objectUnavailableDetectionLevel;
            return this;
        }

        public Builder objectUnavailableIncludeQueryString(@Nullable Boolean objectUnavailableIncludeQueryString) {
            $.objectUnavailableIncludeQueryString = objectUnavailableIncludeQueryString;
            return this;
        }

        public Builder objectUnavailableModifiedPath(@Nullable String objectUnavailableModifiedPath) {
            $.objectUnavailableModifiedPath = objectUnavailableModifiedPath;
            return this;
        }

        public Builder objectUnavailableModifyRequestPath(@Nullable Boolean objectUnavailableModifyRequestPath) {
            $.objectUnavailableModifyRequestPath = objectUnavailableModifyRequestPath;
            return this;
        }

        public Builder objectUnavailableProtocol(@Nullable String objectUnavailableProtocol) {
            $.objectUnavailableProtocol = objectUnavailableProtocol;
            return this;
        }

        public Builder objectUnavailableRecovery(@Nullable String objectUnavailableRecovery) {
            $.objectUnavailableRecovery = objectUnavailableRecovery;
            return this;
        }

        public Builder objectUnavailableRedirectMethod(@Nullable Integer objectUnavailableRedirectMethod) {
            $.objectUnavailableRedirectMethod = objectUnavailableRedirectMethod;
            return this;
        }

        public Builder objectUnavailableResponseCodes(@Nullable List<String> objectUnavailableResponseCodes) {
            $.objectUnavailableResponseCodes = objectUnavailableResponseCodes;
            return this;
        }

        public Builder objectUnavailableResponseCodes(String... objectUnavailableResponseCodes) {
            return objectUnavailableResponseCodes(List.of(objectUnavailableResponseCodes));
        }

        public Builder objectUnavailableRetryLimit(@Nullable String objectUnavailableRetryLimit) {
            $.objectUnavailableRetryLimit = objectUnavailableRetryLimit;
            return this;
        }

        public Builder originUnavailableAlternateHost(@Nullable String originUnavailableAlternateHost) {
            $.originUnavailableAlternateHost = originUnavailableAlternateHost;
            return this;
        }

        public Builder originUnavailableBackupHost(@Nullable String originUnavailableBackupHost) {
            $.originUnavailableBackupHost = originUnavailableBackupHost;
            return this;
        }

        public Builder originUnavailableBlacklistOriginIp(@Nullable Boolean originUnavailableBlacklistOriginIp) {
            $.originUnavailableBlacklistOriginIp = originUnavailableBlacklistOriginIp;
            return this;
        }

        public Builder originUnavailableBlacklistWindow(@Nullable String originUnavailableBlacklistWindow) {
            $.originUnavailableBlacklistWindow = originUnavailableBlacklistWindow;
            return this;
        }

        public Builder originUnavailableChangeProtocol(@Nullable Boolean originUnavailableChangeProtocol) {
            $.originUnavailableChangeProtocol = originUnavailableChangeProtocol;
            return this;
        }

        public Builder originUnavailableDetectionLevel(@Nullable String originUnavailableDetectionLevel) {
            $.originUnavailableDetectionLevel = originUnavailableDetectionLevel;
            return this;
        }

        public Builder originUnavailableIncludeQueryString(@Nullable Boolean originUnavailableIncludeQueryString) {
            $.originUnavailableIncludeQueryString = originUnavailableIncludeQueryString;
            return this;
        }

        public Builder originUnavailableModifiedPath(@Nullable String originUnavailableModifiedPath) {
            $.originUnavailableModifiedPath = originUnavailableModifiedPath;
            return this;
        }

        public Builder originUnavailableModifyRequestPath(@Nullable Boolean originUnavailableModifyRequestPath) {
            $.originUnavailableModifyRequestPath = originUnavailableModifyRequestPath;
            return this;
        }

        public Builder originUnavailableProtocol(@Nullable String originUnavailableProtocol) {
            $.originUnavailableProtocol = originUnavailableProtocol;
            return this;
        }

        public Builder originUnavailableRecovery(@Nullable String originUnavailableRecovery) {
            $.originUnavailableRecovery = originUnavailableRecovery;
            return this;
        }

        public Builder originUnavailableRedirectMethod(@Nullable Integer originUnavailableRedirectMethod) {
            $.originUnavailableRedirectMethod = originUnavailableRedirectMethod;
            return this;
        }

        public Builder originUnavailableResponseCodes(@Nullable List<String> originUnavailableResponseCodes) {
            $.originUnavailableResponseCodes = originUnavailableResponseCodes;
            return this;
        }

        public Builder originUnavailableResponseCodes(String... originUnavailableResponseCodes) {
            return originUnavailableResponseCodes(List.of(originUnavailableResponseCodes));
        }

        public Builder originUnavailableRetryLimit(@Nullable String originUnavailableRetryLimit) {
            $.originUnavailableRetryLimit = originUnavailableRetryLimit;
            return this;
        }

        public Builder originUnresponsiveAlternateHost(@Nullable String originUnresponsiveAlternateHost) {
            $.originUnresponsiveAlternateHost = originUnresponsiveAlternateHost;
            return this;
        }

        public Builder originUnresponsiveBackupHost(@Nullable String originUnresponsiveBackupHost) {
            $.originUnresponsiveBackupHost = originUnresponsiveBackupHost;
            return this;
        }

        public Builder originUnresponsiveBlacklistOriginIp(@Nullable Boolean originUnresponsiveBlacklistOriginIp) {
            $.originUnresponsiveBlacklistOriginIp = originUnresponsiveBlacklistOriginIp;
            return this;
        }

        public Builder originUnresponsiveBlacklistWindow(@Nullable String originUnresponsiveBlacklistWindow) {
            $.originUnresponsiveBlacklistWindow = originUnresponsiveBlacklistWindow;
            return this;
        }

        public Builder originUnresponsiveChangeProtocol(@Nullable Boolean originUnresponsiveChangeProtocol) {
            $.originUnresponsiveChangeProtocol = originUnresponsiveChangeProtocol;
            return this;
        }

        public Builder originUnresponsiveDetectionLevel(@Nullable String originUnresponsiveDetectionLevel) {
            $.originUnresponsiveDetectionLevel = originUnresponsiveDetectionLevel;
            return this;
        }

        public Builder originUnresponsiveIncludeQueryString(@Nullable Boolean originUnresponsiveIncludeQueryString) {
            $.originUnresponsiveIncludeQueryString = originUnresponsiveIncludeQueryString;
            return this;
        }

        public Builder originUnresponsiveModifiedPath(@Nullable String originUnresponsiveModifiedPath) {
            $.originUnresponsiveModifiedPath = originUnresponsiveModifiedPath;
            return this;
        }

        public Builder originUnresponsiveModifyRequestPath(@Nullable Boolean originUnresponsiveModifyRequestPath) {
            $.originUnresponsiveModifyRequestPath = originUnresponsiveModifyRequestPath;
            return this;
        }

        public Builder originUnresponsiveProtocol(@Nullable String originUnresponsiveProtocol) {
            $.originUnresponsiveProtocol = originUnresponsiveProtocol;
            return this;
        }

        public Builder originUnresponsiveRecovery(@Nullable String originUnresponsiveRecovery) {
            $.originUnresponsiveRecovery = originUnresponsiveRecovery;
            return this;
        }

        public Builder originUnresponsiveRedirectMethod(@Nullable Integer originUnresponsiveRedirectMethod) {
            $.originUnresponsiveRedirectMethod = originUnresponsiveRedirectMethod;
            return this;
        }

        public Builder originUnresponsiveRetryLimit(@Nullable String originUnresponsiveRetryLimit) {
            $.originUnresponsiveRetryLimit = originUnresponsiveRetryLimit;
            return this;
        }

        public Builder otherOptions(@Nullable String otherOptions) {
            $.otherOptions = otherOptions;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorMediaOriginFailover build() {
            return $;
        }
    }

}
