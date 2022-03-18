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
    public sealed class GetCloudletsAudienceSegmentationMatchRuleMatchRuleMatchResult
    {
        /// <summary>
        /// - (Optional) Whether the match is case sensitive.
        /// </summary>
        public readonly bool? CaseSensitive;
        /// <summary>
        /// - (Optional) For `clientip`, `continent`, `countrycode`, `proxy`, and `regioncode` match types, this defines the part of the request that determines the IP address to use. Values include the connecting IP address (`CONNECTING_IP`) and the X_Forwarded_For header (`XFF_HEADERS`). To select both, enter the two values separated by a space delimiter. When both values are included, the connecting IP address is evaluated first.
        /// </summary>
        public readonly string? CheckIps;
        /// <summary>
        /// - (Optional) Compares a string expression with a pattern, either `contains`, `exists`, or `equals`.
        /// </summary>
        public readonly string? MatchOperator;
        /// <summary>
        /// - (Optional) The type of match used, either header`, `hostname`, `path`, `extension`, `query`, `regex`, `cookie`, `deviceCharacteristics`, `clientip`, `continent`, `countrycode`, `regioncode`, `protocol`, `method`, or `proxy`.
        /// </summary>
        public readonly string? MatchType;
        /// <summary>
        /// - (Optional) This depends on the `match_type`. If the `match_type` is `hostname`, then `match_value` is the fully qualified domain name, like `www.akamai.com`.
        /// </summary>
        public readonly string? MatchValue;
        /// <summary>
        /// - (Optional) Whether to negate the match.
        /// </summary>
        public readonly bool? Negate;
        /// <summary>
        /// - (Optional) If `match_value` is empty, this argument is required. An object used when a rule includes more complex match criteria, like multiple value attributes. Includes these sub-arguments:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleMatchObjectMatchValueResult> ObjectMatchValues;

        [OutputConstructor]
        private GetCloudletsAudienceSegmentationMatchRuleMatchRuleMatchResult(
            bool? caseSensitive,

            string? checkIps,

            string? matchOperator,

            string? matchType,

            string? matchValue,

            bool? negate,

            ImmutableArray<Outputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleMatchObjectMatchValueResult> objectMatchValues)
        {
            CaseSensitive = caseSensitive;
            CheckIps = checkIps;
            MatchOperator = matchOperator;
            MatchType = matchType;
            MatchValue = matchValue;
            Negate = negate;
            ObjectMatchValues = objectMatchValues;
        }
    }
}