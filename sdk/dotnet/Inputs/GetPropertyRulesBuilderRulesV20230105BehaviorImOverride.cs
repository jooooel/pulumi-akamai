// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorImOverrideArgs : global::Pulumi.InvokeArgs
    {
        [Input("dpr")]
        public double? Dpr { get; set; }

        [Input("dprvar")]
        public string? Dprvar { get; set; }

        [Input("excludeAllQueryParameters")]
        public bool? ExcludeAllQueryParameters { get; set; }

        [Input("excludedQueryParameters")]
        private List<string>? _excludedQueryParameters;
        public List<string> ExcludedQueryParameters
        {
            get => _excludedQueryParameters ?? (_excludedQueryParameters = new List<string>());
            set => _excludedQueryParameters = value;
        }

        [Input("format")]
        public string? Format { get; set; }

        [Input("formatvar")]
        public string? Formatvar { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("override")]
        public string? Override { get; set; }

        [Input("policy")]
        public string? Policy { get; set; }

        [Input("policyvar")]
        public string? Policyvar { get; set; }

        [Input("policyvarIMvar")]
        public string? PolicyvarIMvar { get; set; }

        [Input("policyvarName")]
        public string? PolicyvarName { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("typesel")]
        public string? Typesel { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        [Input("width")]
        public double? Width { get; set; }

        [Input("widthvar")]
        public string? Widthvar { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorImOverrideArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorImOverrideArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorImOverrideArgs();
    }
}