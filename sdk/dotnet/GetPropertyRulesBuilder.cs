// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetPropertyRulesBuilder
    {
        public static Task<GetPropertyRulesBuilderResult> InvokeAsync(GetPropertyRulesBuilderArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPropertyRulesBuilderResult>("akamai:index/getPropertyRulesBuilder:getPropertyRulesBuilder", args ?? new GetPropertyRulesBuilderArgs(), options.WithDefaults());

        public static Output<GetPropertyRulesBuilderResult> Invoke(GetPropertyRulesBuilderInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPropertyRulesBuilderResult>("akamai:index/getPropertyRulesBuilder:getPropertyRulesBuilder", args ?? new GetPropertyRulesBuilderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPropertyRulesBuilderArgs : global::Pulumi.InvokeArgs
    {
        [Input("rulesV20230105")]
        public Inputs.GetPropertyRulesBuilderRulesV20230105Args? RulesV20230105 { get; set; }

        public GetPropertyRulesBuilderArgs()
        {
        }
        public static new GetPropertyRulesBuilderArgs Empty => new GetPropertyRulesBuilderArgs();
    }

    public sealed class GetPropertyRulesBuilderInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("rulesV20230105")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230105InputArgs>? RulesV20230105 { get; set; }

        public GetPropertyRulesBuilderInvokeArgs()
        {
        }
        public static new GetPropertyRulesBuilderInvokeArgs Empty => new GetPropertyRulesBuilderInvokeArgs();
    }


    [OutputType]
    public sealed class GetPropertyRulesBuilderResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string RuleFormat;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230105Result? RulesV20230105;

        [OutputConstructor]
        private GetPropertyRulesBuilderResult(
            string id,

            string json,

            string ruleFormat,

            Outputs.GetPropertyRulesBuilderRulesV20230105Result? rulesV20230105)
        {
            Id = id;
            Json = json;
            RuleFormat = ruleFormat;
            RulesV20230105 = rulesV20230105;
        }
    }
}