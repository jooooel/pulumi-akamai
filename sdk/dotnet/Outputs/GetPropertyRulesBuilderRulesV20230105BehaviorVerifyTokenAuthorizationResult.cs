// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorVerifyTokenAuthorizationResult
    {
        public readonly string? Algorithm;
        public readonly bool? EscapeHmacInputs;
        public readonly bool? FailureResponse;
        public readonly bool? IgnoreQueryString;
        public readonly string? Key;
        public readonly string? Location;
        public readonly string? LocationId;
        public readonly bool? Locked;
        public readonly string? Salt;
        public readonly string? TemplateUuid;
        public readonly string? TransitionKey;
        public readonly bool? UseAdvanced;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorVerifyTokenAuthorizationResult(
            string? algorithm,

            bool? escapeHmacInputs,

            bool? failureResponse,

            bool? ignoreQueryString,

            string? key,

            string? location,

            string? locationId,

            bool? locked,

            string? salt,

            string? templateUuid,

            string? transitionKey,

            bool? useAdvanced,

            string? uuid)
        {
            Algorithm = algorithm;
            EscapeHmacInputs = escapeHmacInputs;
            FailureResponse = failureResponse;
            IgnoreQueryString = ignoreQueryString;
            Key = key;
            Location = location;
            LocationId = locationId;
            Locked = locked;
            Salt = salt;
            TemplateUuid = templateUuid;
            TransitionKey = transitionKey;
            UseAdvanced = useAdvanced;
            Uuid = uuid;
        }
    }
}