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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection();

    @Import(name="acl")
    private @Nullable Boolean acl;

    public Optional<Boolean> acl() {
        return Optional.ofNullable(this.acl);
    }

    @Import(name="dashMediaEncryption")
    private @Nullable Boolean dashMediaEncryption;

    public Optional<Boolean> dashMediaEncryption() {
        return Optional.ofNullable(this.dashMediaEncryption);
    }

    @Import(name="dataPayload")
    private @Nullable Boolean dataPayload;

    public Optional<Boolean> dataPayload() {
        return Optional.ofNullable(this.dataPayload);
    }

    @Import(name="enableTokenInUri")
    private @Nullable Boolean enableTokenInUri;

    public Optional<Boolean> enableTokenInUri() {
        return Optional.ofNullable(this.enableTokenInUri);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="fieldCarryOver")
    private @Nullable String fieldCarryOver;

    public Optional<String> fieldCarryOver() {
        return Optional.ofNullable(this.fieldCarryOver);
    }

    @Import(name="headerForSalts")
    private @Nullable List<String> headerForSalts;

    public Optional<List<String>> headerForSalts() {
        return Optional.ofNullable(this.headerForSalts);
    }

    @Import(name="hlsMasterManifestFiles")
    private @Nullable List<String> hlsMasterManifestFiles;

    public Optional<List<String>> hlsMasterManifestFiles() {
        return Optional.ofNullable(this.hlsMasterManifestFiles);
    }

    @Import(name="hlsMediaEncryption")
    private @Nullable Boolean hlsMediaEncryption;

    public Optional<Boolean> hlsMediaEncryption() {
        return Optional.ofNullable(this.hlsMediaEncryption);
    }

    @Import(name="ip")
    private @Nullable Boolean ip;

    public Optional<Boolean> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="mediaEncryptionTitle")
    private @Nullable String mediaEncryptionTitle;

    public Optional<String> mediaEncryptionTitle() {
        return Optional.ofNullable(this.mediaEncryptionTitle);
    }

    @Import(name="revokedListId")
    private @Nullable Integer revokedListId;

    public Optional<Integer> revokedListId() {
        return Optional.ofNullable(this.revokedListId);
    }

    @Import(name="salt")
    private @Nullable String salt;

    public Optional<String> salt() {
        return Optional.ofNullable(this.salt);
    }

    @Import(name="sessionId")
    private @Nullable Boolean sessionId;

    public Optional<Boolean> sessionId() {
        return Optional.ofNullable(this.sessionId);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="tokenAuthHlsTitle")
    private @Nullable String tokenAuthHlsTitle;

    public Optional<String> tokenAuthHlsTitle() {
        return Optional.ofNullable(this.tokenAuthHlsTitle);
    }

    @Import(name="tokenAuthenticationTitle")
    private @Nullable String tokenAuthenticationTitle;

    public Optional<String> tokenAuthenticationTitle() {
        return Optional.ofNullable(this.tokenAuthenticationTitle);
    }

    @Import(name="tokenRevocationEnabled")
    private @Nullable Boolean tokenRevocationEnabled;

    public Optional<Boolean> tokenRevocationEnabled() {
        return Optional.ofNullable(this.tokenRevocationEnabled);
    }

    @Import(name="tokenRevocationTitle")
    private @Nullable String tokenRevocationTitle;

    public Optional<String> tokenRevocationTitle() {
        return Optional.ofNullable(this.tokenRevocationTitle);
    }

    @Import(name="transitionKey")
    private @Nullable String transitionKey;

    public Optional<String> transitionKey() {
        return Optional.ofNullable(this.transitionKey);
    }

    @Import(name="useAdvanced")
    private @Nullable Boolean useAdvanced;

    public Optional<Boolean> useAdvanced() {
        return Optional.ofNullable(this.useAdvanced);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection(GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection $) {
        this.acl = $.acl;
        this.dashMediaEncryption = $.dashMediaEncryption;
        this.dataPayload = $.dataPayload;
        this.enableTokenInUri = $.enableTokenInUri;
        this.enabled = $.enabled;
        this.fieldCarryOver = $.fieldCarryOver;
        this.headerForSalts = $.headerForSalts;
        this.hlsMasterManifestFiles = $.hlsMasterManifestFiles;
        this.hlsMediaEncryption = $.hlsMediaEncryption;
        this.ip = $.ip;
        this.key = $.key;
        this.locked = $.locked;
        this.mediaEncryptionTitle = $.mediaEncryptionTitle;
        this.revokedListId = $.revokedListId;
        this.salt = $.salt;
        this.sessionId = $.sessionId;
        this.templateUuid = $.templateUuid;
        this.tokenAuthHlsTitle = $.tokenAuthHlsTitle;
        this.tokenAuthenticationTitle = $.tokenAuthenticationTitle;
        this.tokenRevocationEnabled = $.tokenRevocationEnabled;
        this.tokenRevocationTitle = $.tokenRevocationTitle;
        this.transitionKey = $.transitionKey;
        this.useAdvanced = $.useAdvanced;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection(Objects.requireNonNull(defaults));
        }

        public Builder acl(@Nullable Boolean acl) {
            $.acl = acl;
            return this;
        }

        public Builder dashMediaEncryption(@Nullable Boolean dashMediaEncryption) {
            $.dashMediaEncryption = dashMediaEncryption;
            return this;
        }

        public Builder dataPayload(@Nullable Boolean dataPayload) {
            $.dataPayload = dataPayload;
            return this;
        }

        public Builder enableTokenInUri(@Nullable Boolean enableTokenInUri) {
            $.enableTokenInUri = enableTokenInUri;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder fieldCarryOver(@Nullable String fieldCarryOver) {
            $.fieldCarryOver = fieldCarryOver;
            return this;
        }

        public Builder headerForSalts(@Nullable List<String> headerForSalts) {
            $.headerForSalts = headerForSalts;
            return this;
        }

        public Builder headerForSalts(String... headerForSalts) {
            return headerForSalts(List.of(headerForSalts));
        }

        public Builder hlsMasterManifestFiles(@Nullable List<String> hlsMasterManifestFiles) {
            $.hlsMasterManifestFiles = hlsMasterManifestFiles;
            return this;
        }

        public Builder hlsMasterManifestFiles(String... hlsMasterManifestFiles) {
            return hlsMasterManifestFiles(List.of(hlsMasterManifestFiles));
        }

        public Builder hlsMediaEncryption(@Nullable Boolean hlsMediaEncryption) {
            $.hlsMediaEncryption = hlsMediaEncryption;
            return this;
        }

        public Builder ip(@Nullable Boolean ip) {
            $.ip = ip;
            return this;
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder mediaEncryptionTitle(@Nullable String mediaEncryptionTitle) {
            $.mediaEncryptionTitle = mediaEncryptionTitle;
            return this;
        }

        public Builder revokedListId(@Nullable Integer revokedListId) {
            $.revokedListId = revokedListId;
            return this;
        }

        public Builder salt(@Nullable String salt) {
            $.salt = salt;
            return this;
        }

        public Builder sessionId(@Nullable Boolean sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder tokenAuthHlsTitle(@Nullable String tokenAuthHlsTitle) {
            $.tokenAuthHlsTitle = tokenAuthHlsTitle;
            return this;
        }

        public Builder tokenAuthenticationTitle(@Nullable String tokenAuthenticationTitle) {
            $.tokenAuthenticationTitle = tokenAuthenticationTitle;
            return this;
        }

        public Builder tokenRevocationEnabled(@Nullable Boolean tokenRevocationEnabled) {
            $.tokenRevocationEnabled = tokenRevocationEnabled;
            return this;
        }

        public Builder tokenRevocationTitle(@Nullable String tokenRevocationTitle) {
            $.tokenRevocationTitle = tokenRevocationTitle;
            return this;
        }

        public Builder transitionKey(@Nullable String transitionKey) {
            $.transitionKey = transitionKey;
            return this;
        }

        public Builder useAdvanced(@Nullable Boolean useAdvanced) {
            $.useAdvanced = useAdvanced;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedContentProtection build() {
            return $;
        }
    }

}