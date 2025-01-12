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
    public sealed class GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptionsResult
    {
        public readonly bool? ValueCaseSensitive;
        public readonly bool? ValueEscaped;
        public readonly bool? ValueHasWildcard;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptionsResult(
            bool? valueCaseSensitive,

            bool? valueEscaped,

            bool? valueHasWildcard,

            ImmutableArray<string> values)
        {
            ValueCaseSensitive = valueCaseSensitive;
            ValueEscaped = valueEscaped;
            ValueHasWildcard = valueHasWildcard;
            Values = values;
        }
    }
}
